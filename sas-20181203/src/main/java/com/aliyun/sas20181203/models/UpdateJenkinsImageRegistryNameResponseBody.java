// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateJenkinsImageRegistryNameResponseBody extends TeaModel {
    /**
     * <p>The result of the operation. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: successful</li>
     * <li><strong>false</strong>: failed</li>
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
     * <p>4347E985-6E64-467B-96EC-30D4EA9E****</p>
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

    public static UpdateJenkinsImageRegistryNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateJenkinsImageRegistryNameResponseBody self = new UpdateJenkinsImageRegistryNameResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateJenkinsImageRegistryNameResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateJenkinsImageRegistryNameResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateJenkinsImageRegistryNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateJenkinsImageRegistryNameResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

}
