// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsTransparentProxyLogRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ModifyName")
    public String modifyName;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TimeSort")
    public String timeSort;

    public static QueryMsTransparentProxyLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsTransparentProxyLogRequest self = new QueryMsTransparentProxyLogRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsTransparentProxyLogRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryMsTransparentProxyLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMsTransparentProxyLogRequest setModifyName(String modifyName) {
        this.modifyName = modifyName;
        return this;
    }
    public String getModifyName() {
        return this.modifyName;
    }

    public QueryMsTransparentProxyLogRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryMsTransparentProxyLogRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsTransparentProxyLogRequest setTimeSort(String timeSort) {
        this.timeSort = timeSort;
        return this;
    }
    public String getTimeSort() {
        return this.timeSort;
    }

}
