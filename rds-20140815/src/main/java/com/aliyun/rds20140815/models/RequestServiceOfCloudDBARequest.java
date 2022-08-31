// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RequestServiceOfCloudDBARequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ServiceRequestParam")
    public String serviceRequestParam;

    @NameInMap("ServiceRequestType")
    public String serviceRequestType;

    public static RequestServiceOfCloudDBARequest build(java.util.Map<String, ?> map) throws Exception {
        RequestServiceOfCloudDBARequest self = new RequestServiceOfCloudDBARequest();
        return TeaModel.build(map, self);
    }

    public RequestServiceOfCloudDBARequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RequestServiceOfCloudDBARequest setServiceRequestParam(String serviceRequestParam) {
        this.serviceRequestParam = serviceRequestParam;
        return this;
    }
    public String getServiceRequestParam() {
        return this.serviceRequestParam;
    }

    public RequestServiceOfCloudDBARequest setServiceRequestType(String serviceRequestType) {
        this.serviceRequestType = serviceRequestType;
        return this;
    }
    public String getServiceRequestType() {
        return this.serviceRequestType;
    }

}
