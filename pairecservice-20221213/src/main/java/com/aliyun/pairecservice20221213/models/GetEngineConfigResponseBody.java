// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetEngineConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>Pre</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <strong>example:</strong>
     * <p>2024-01-03T02:28:00.000Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2024-08-27T12:00:00Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>2024-01-03 02:28:00</p>
     */
    @NameInMap("GmtReleasedTime")
    public String gmtReleasedTime;

    /**
     * <strong>example:</strong>
     * <p>engine_config_v1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>59CE7EC6-F268-5D71-9215-32922CC50D72</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Released</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetEngineConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEngineConfigResponseBody self = new GetEngineConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEngineConfigResponseBody setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public GetEngineConfigResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetEngineConfigResponseBody setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public GetEngineConfigResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetEngineConfigResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetEngineConfigResponseBody setGmtReleasedTime(String gmtReleasedTime) {
        this.gmtReleasedTime = gmtReleasedTime;
        return this;
    }
    public String getGmtReleasedTime() {
        return this.gmtReleasedTime;
    }

    public GetEngineConfigResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetEngineConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEngineConfigResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
