// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateJenkinsImageRegistryPersistenceDayResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

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
     * <p>69F88BA1-004C-51E2-BF5C-A3220E5A****</p>
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

    public static UpdateJenkinsImageRegistryPersistenceDayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateJenkinsImageRegistryPersistenceDayResponseBody self = new UpdateJenkinsImageRegistryPersistenceDayResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateJenkinsImageRegistryPersistenceDayResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateJenkinsImageRegistryPersistenceDayResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateJenkinsImageRegistryPersistenceDayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateJenkinsImageRegistryPersistenceDayResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

}
