// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceSubscribersRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Start")
    public String start;

    public static QueryMsSgServiceSubscribersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceSubscribersRequest self = new QueryMsSgServiceSubscribersRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceSubscribersRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryMsSgServiceSubscribersRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public QueryMsSgServiceSubscribersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMsSgServiceSubscribersRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryMsSgServiceSubscribersRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

}
