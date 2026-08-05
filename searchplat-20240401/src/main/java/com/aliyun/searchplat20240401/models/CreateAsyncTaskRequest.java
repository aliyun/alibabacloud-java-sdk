// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateAsyncTaskRequest extends TeaModel {
    /**
     * <p>The playground data ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12323</p>
     */
    @NameInMap("dataId")
    public Long dataId;

    /**
     * <p>The asynchronous task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fae9bcc5-949f-4c31-b9b7-a273bf891699</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>文档解析任务</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ops-document-analyze-001</p>
     */
    @NameInMap("serviceId")
    public String serviceId;

    /**
     * <p>The service type.</p>
     * 
     * <strong>example:</strong>
     * <p>document-analyze</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    /**
     * <p>Specifies whether to perform a dry run request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateAsyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAsyncTaskRequest self = new CreateAsyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAsyncTaskRequest setDataId(Long dataId) {
        this.dataId = dataId;
        return this;
    }
    public Long getDataId() {
        return this.dataId;
    }

    public CreateAsyncTaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateAsyncTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAsyncTaskRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateAsyncTaskRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public CreateAsyncTaskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
