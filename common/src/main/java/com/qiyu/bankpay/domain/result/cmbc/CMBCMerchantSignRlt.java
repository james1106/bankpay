package com.qiyu.bankpay.domain.result.cmbc;

import java.io.Serializable;

/**
 * Created by Qidi on 2016/11/16.
 */
public class CMBCMerchantSignRlt extends CMBCBaseRlt implements Serializable {
    //银行商户编码
    private String merchantCode;

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }
}
