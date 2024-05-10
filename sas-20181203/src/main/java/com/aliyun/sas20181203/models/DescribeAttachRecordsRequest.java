// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAttachRecordsRequest extends TeaModel {
    /**
     * <p>The application group ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The UUIDs of ECS instances to be queried.</p>
     */
    @NameInMap("EcsUUIDList")
    public java.util.List<String> ecsUUIDList;

    public static DescribeAttachRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttachRecordsRequest self = new DescribeAttachRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAttachRecordsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeAttachRecordsRequest setEcsUUIDList(java.util.List<String> ecsUUIDList) {
        this.ecsUUIDList = ecsUUIDList;
        return this;
    }
    public java.util.List<String> getEcsUUIDList() {
        return this.ecsUUIDList;
    }

}
