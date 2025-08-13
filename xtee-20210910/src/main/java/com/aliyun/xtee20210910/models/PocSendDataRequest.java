// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class PocSendDataRequest extends TeaModel {
    /**
     * <p>Starting position for batch operations, starting from 0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d0</p>
     */
    @NameInMap("BatchNo")
    public Long batchNo;

    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Return parameters, in JSON format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c222460c</p>
     */
    @NameInMap("ParamsList")
    public String paramsList;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>Task token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a471aa421752633438</p>
     */
    @NameInMap("Token")
    public String token;

    public static PocSendDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PocSendDataRequest self = new PocSendDataRequest();
        return TeaModel.build(map, self);
    }

    public PocSendDataRequest setBatchNo(Long batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public Long getBatchNo() {
        return this.batchNo;
    }

    public PocSendDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public PocSendDataRequest setParamsList(String paramsList) {
        this.paramsList = paramsList;
        return this;
    }
    public String getParamsList() {
        return this.paramsList;
    }

    public PocSendDataRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public PocSendDataRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
