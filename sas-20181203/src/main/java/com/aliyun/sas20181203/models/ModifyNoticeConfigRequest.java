// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyNoticeConfigRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Route")
    public Integer route;

    @NameInMap("Project")
    public String project;

    @NameInMap("TimeLimit")
    public Integer timeLimit;

    public static ModifyNoticeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNoticeConfigRequest self = new ModifyNoticeConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNoticeConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyNoticeConfigRequest setRoute(Integer route) {
        this.route = route;
        return this;
    }
    public Integer getRoute() {
        return this.route;
    }

    public ModifyNoticeConfigRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ModifyNoticeConfigRequest setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
        return this;
    }
    public Integer getTimeLimit() {
        return this.timeLimit;
    }

}
