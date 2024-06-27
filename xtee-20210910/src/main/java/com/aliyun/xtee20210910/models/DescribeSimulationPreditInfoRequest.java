// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSimulationPreditInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
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
