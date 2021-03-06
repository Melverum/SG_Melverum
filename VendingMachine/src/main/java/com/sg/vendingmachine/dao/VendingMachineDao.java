/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Item;
import java.util.List;

/**
 *
 * @author Melve
 */
public interface VendingMachineDao {

    public List<Item> getAllItems()
            throws VendingMachineDaoException;

    public void editItem(int quantity, Item item)
            throws VendingMachineDaoException;

    public void removeItem(String id, Item item)
            throws VendingMachineDaoException;

    public Item getItem(String itemId)
            throws VendingMachineDaoException;

    public void writeAuditEntry(String entry) throws VendingMachineDaoException;
    

}
