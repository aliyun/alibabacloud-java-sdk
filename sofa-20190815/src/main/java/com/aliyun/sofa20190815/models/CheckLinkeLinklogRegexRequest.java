// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeLinklogRegexRequest extends TeaModel {
    @NameInMap("SampleLog")
    public String sampleLog;

    @NameInMap("ConditionsRepeatList")
    public java.util.List<String> conditionsRepeatList;

    public static CheckLinkeLinklogRegexRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeLinklogRegexRequest self = new CheckLinkeLinklogRegexRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeLinklogRegexRequest setSampleLog(String sampleLog) {
        this.sampleLog = sampleLog;
        return this;
    }
    public String getSampleLog() {
        return this.sampleLog;
    }

    public CheckLinkeLinklogRegexRequest setConditionsRepeatList(java.util.List<String> conditionsRepeatList) {
        this.conditionsRepeatList = conditionsRepeatList;
        return this;
    }
    public java.util.List<String> getConditionsRepeatList() {
        return this.conditionsRepeatList;
    }

}
