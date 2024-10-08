// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryJenkinsImageRegistryPersistenceDayResponseBody extends TeaModel {
    /**
     * <p>The retention period. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Data")
    public Integer data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>EA4AC8B7-0C18-5BC1-9DA4-798B3BE4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time consumed. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeCost")
    public Long timeCost;

    public static QueryJenkinsImageRegistryPersistenceDayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryJenkinsImageRegistryPersistenceDayResponseBody self = new QueryJenkinsImageRegistryPersistenceDayResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryJenkinsImageRegistryPersistenceDayResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public QueryJenkinsImageRegistryPersistenceDayResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryJenkinsImageRegistryPersistenceDayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryJenkinsImageRegistryPersistenceDayResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

}
