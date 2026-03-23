// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class StoreViewStore extends TeaModel {
    /**
     * <p>Project 名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ali-test-project</p>
     */
    @NameInMap("project")
    public String project;

    /**
     * <p>查询过滤语句</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>LogStore 或 MetricStore 名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-logstore</p>
     */
    @NameInMap("storeName")
    public String storeName;

    public static StoreViewStore build(java.util.Map<String, ?> map) throws Exception {
        StoreViewStore self = new StoreViewStore();
        return TeaModel.build(map, self);
    }

    public StoreViewStore setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public StoreViewStore setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public StoreViewStore setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

}
