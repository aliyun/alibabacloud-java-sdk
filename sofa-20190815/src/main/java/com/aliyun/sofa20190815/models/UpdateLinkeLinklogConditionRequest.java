// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogConditionRequest extends TeaModel {
    @NameInMap("Compiled")
    public String compiled;

    @NameInMap("ConditionId")
    public Long conditionId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("IndicationId")
    public Long indicationId;

    @NameInMap("LogSample")
    public String logSample;

    @NameInMap("Pattern")
    public String pattern;

    public static UpdateLinkeLinklogConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogConditionRequest self = new UpdateLinkeLinklogConditionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogConditionRequest setCompiled(String compiled) {
        this.compiled = compiled;
        return this;
    }
    public String getCompiled() {
        return this.compiled;
    }

    public UpdateLinkeLinklogConditionRequest setConditionId(Long conditionId) {
        this.conditionId = conditionId;
        return this;
    }
    public Long getConditionId() {
        return this.conditionId;
    }

    public UpdateLinkeLinklogConditionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeLinklogConditionRequest setIndicationId(Long indicationId) {
        this.indicationId = indicationId;
        return this;
    }
    public Long getIndicationId() {
        return this.indicationId;
    }

    public UpdateLinkeLinklogConditionRequest setLogSample(String logSample) {
        this.logSample = logSample;
        return this;
    }
    public String getLogSample() {
        return this.logSample;
    }

    public UpdateLinkeLinklogConditionRequest setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

}
