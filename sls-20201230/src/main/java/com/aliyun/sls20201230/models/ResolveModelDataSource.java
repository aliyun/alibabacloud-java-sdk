// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ResolveModelDataSource extends TeaModel {
    /**
     * <p>The Logstore name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>managed-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The project name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>managed-project</p>
     */
    @NameInMap("project")
    public String project;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    public static ResolveModelDataSource build(java.util.Map<String, ?> map) throws Exception {
        ResolveModelDataSource self = new ResolveModelDataSource();
        return TeaModel.build(map, self);
    }

    public ResolveModelDataSource setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ResolveModelDataSource setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ResolveModelDataSource setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
