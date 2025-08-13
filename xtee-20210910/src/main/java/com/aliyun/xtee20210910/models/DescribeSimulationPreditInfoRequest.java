// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSimulationPreditInfoRequest extends TeaModel {
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
     * <p>Event code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de_azywkh7523</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Policy list</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;100244\&quot;,\&quot;100245\&quot;]</p>
     */
    @NameInMap("rulesStr")
    public String rulesStr;

    public static DescribeSimulationPreditInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimulationPreditInfoRequest self = new DescribeSimulationPreditInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSimulationPreditInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSimulationPreditInfoRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DescribeSimulationPreditInfoRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSimulationPreditInfoRequest setRulesStr(String rulesStr) {
        this.rulesStr = rulesStr;
        return this;
    }
    public String getRulesStr() {
        return this.rulesStr;
    }

}
