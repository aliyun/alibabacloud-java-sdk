// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ReceiveFunctionTrialRewardByAliUidRequest extends TeaModel {
    /**
     * <p>The name of the feature for which you want to apply for a free trial. Valid values:</p>
     * <ul>
     * <li><strong>trail_honeypot_reward</strong>: cloud honeypot</li>
     * <li><strong>trail_file_detect_api_reward</strong>: SDK for malicious file detection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>trail_honeypot_reward</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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

    public static ReceiveFunctionTrialRewardByAliUidRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiveFunctionTrialRewardByAliUidRequest self = new ReceiveFunctionTrialRewardByAliUidRequest();
        return TeaModel.build(map, self);
    }

    public ReceiveFunctionTrialRewardByAliUidRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ReceiveFunctionTrialRewardByAliUidRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
