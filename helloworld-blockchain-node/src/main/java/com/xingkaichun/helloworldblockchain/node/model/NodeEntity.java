package com.xingkaichun.helloworldblockchain.node.model;

import com.xingkaichun.helloworldblockchain.node.dto.nodeserver.SimpleNode;
import lombok.Data;

import java.math.BigInteger;

/**
 *
 * @author 邢开春 xingkaichun@qq.com
 */
@Data
public class NodeEntity extends SimpleNode{

    private BigInteger blockChainHeight;
    private Boolean isNodeAvailable;
    private Integer errorConnectionTimes;
    private Boolean fork;
}
