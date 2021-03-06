package com.qiyu.bankpay.domain.result.kft;

import com.qiyu.bankpay.domain.result.CallBackRlt;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/11/28.
 */
public class KFTPayCallBackRlt extends KFTBaseRlt implements Serializable {
    //支付渠道
    private String channel;
    //通道类型
    private String payChannelType;
    //终端类型
    private String terminalType;
    //操作员
    private String cashierName;
    //商户订单号
    private String outTradeNo;
    //支付渠道订单号
    private String outChannelNo;
    //商品描述
    private String body;
    //货币类型
    private String currency;
    //交易金额
    private BigDecimal amount;
    //交易时间
    private String transTime;
    //附言
    private String postscript;
    //商品标题
    private String subject;
    //订单状态
    private String status;
    //商户退款订单号
    private String outRefundNo;
    //支付渠道退款单号
    private String channelRefundNo;
    //退款时间
    private String refundTime;
    //退款状态
    private String refundStatus;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getPayChannelType() {
        return payChannelType;
    }

    public void setPayChannelType(String payChannelType) {
        this.payChannelType = payChannelType;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getOutChannelNo() {
        return outChannelNo;
    }

    public void setOutChannelNo(String outChannelNo) {
        this.outChannelNo = outChannelNo;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public String getChannelRefundNo() {
        return channelRefundNo;
    }

    public void setChannelRefundNo(String channelRefundNo) {
        this.channelRefundNo = channelRefundNo;
    }

    public String getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(String refundTime) {
        this.refundTime = refundTime;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }
}
