// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetConsoleFuncGrayStatusRequest extends TeaModel {
    /**
     * <p>Name of the function module.</p>
     * 
     * <strong>example:</strong>
     * <p>vpcConsoleSwitch</p>
     */
    @NameInMap("Condition")
    public String condition;

    /**
     * <p>Set the language type for request and response messages. Default value: <strong>zh</strong>. Values:</p>
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

    public static GetConsoleFuncGrayStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConsoleFuncGrayStatusRequest self = new GetConsoleFuncGrayStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetConsoleFuncGrayStatusRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public GetConsoleFuncGrayStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
