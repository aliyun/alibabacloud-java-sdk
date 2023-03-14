// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class SplitVideoPartsAdvanceRequest extends TeaModel {
    @NameInMap("MaxTime")
    public Integer maxTime;

    @NameInMap("MinTime")
    public Integer minTime;

    @NameInMap("Template")
    public String template;

    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

    public static SplitVideoPartsAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SplitVideoPartsAdvanceRequest self = new SplitVideoPartsAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SplitVideoPartsAdvanceRequest setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public Integer getMaxTime() {
        return this.maxTime;
    }

    public SplitVideoPartsAdvanceRequest setMinTime(Integer minTime) {
        this.minTime = minTime;
        return this;
    }
    public Integer getMinTime() {
        return this.minTime;
    }

    public SplitVideoPartsAdvanceRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public SplitVideoPartsAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

}
