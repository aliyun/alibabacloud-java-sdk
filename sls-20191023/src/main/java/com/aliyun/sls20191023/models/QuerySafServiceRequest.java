// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class QuerySafServiceRequest extends TeaModel {
    @NameInMap("ParamType")
    public String paramType;

    @NameInMap("ParamValue")
    public String paramValue;

    @NameInMap("ProjectName")
    public String projectName;

    public static QuerySafServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySafServiceRequest self = new QuerySafServiceRequest();
        return TeaModel.build(map, self);
    }

    public QuerySafServiceRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public QuerySafServiceRequest setParamValue(String paramValue) {
        this.paramValue = paramValue;
        return this;
    }
    public String getParamValue() {
        return this.paramValue;
    }

    public QuerySafServiceRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
