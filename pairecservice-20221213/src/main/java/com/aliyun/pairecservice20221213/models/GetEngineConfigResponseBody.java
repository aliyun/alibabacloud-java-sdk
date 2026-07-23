// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetEngineConfigResponseBody extends TeaModel {
    /**
     * <p>The content of the engine configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>The description of the engine configuration.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The environment. Valid values:</p>
     * <ul>
     * <li><p>Daily: The daily environment.</p>
     * </li>
     * <li><p>Pre: The pre-production environment.</p>
     * </li>
     * <li><p>Prod: The production environment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pre</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The time the engine configuration was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-03T02:28:00.000Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time the engine configuration was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-27T12:00:00Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The time the engine configuration was published.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-03 02:28:00</p>
     */
    @NameInMap("GmtReleasedTime")
    public String gmtReleasedTime;

    /**
     * <p>The engine configuration name.</p>
     * 
     * <strong>example:</strong>
     * <p>engine_config_v1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>59CE7EC6-F268-5D71-9215-32922CC50D72</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li><p>Released: Published</p>
     * </li>
     * <li><p>UnReleased: Unpublished</p>
     * </li>
     * </ul>
     * 
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
