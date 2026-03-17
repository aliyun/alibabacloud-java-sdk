// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetSmartAGDpiAttributeResponseBody extends TeaModel {
    /**
     * <p>The status of the DPI-based monitoring feature. Valid values:</p>
     * <ul>
     * <li><strong>Active</strong>: enabled</li>
     * <li><strong>Inactive</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Inactive</p>
     */
    @NameInMap("DpiMonitorStatus")
    public String dpiMonitorStatus;

    /**
     * <p>The status of the DPI feature. Valid values:</p>
     * <ul>
     * <li><strong>On</strong>: enabled</li>
     * <li><strong>Off</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>On</p>
     */
    @NameInMap("DpiStatus")
    public String dpiStatus;

    /**
     * <p>The name of the Log Service Logstore that is associated with the DPI feature.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("LogstoreName")
    public String logstoreName;

    /**
     * <p>The name of the Log Service project that is associated with the DPI feature.</p>
     * 
     * <strong>example:</strong>
     * <p>test2</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B2997DC4-F1A2-418B-81FC-C8892CD31CFF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The region where Log Service is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("SlsRegion")
    public String slsRegion;

    public static GetSmartAGDpiAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmartAGDpiAttributeResponseBody self = new GetSmartAGDpiAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmartAGDpiAttributeResponseBody setDpiMonitorStatus(String dpiMonitorStatus) {
        this.dpiMonitorStatus = dpiMonitorStatus;
        return this;
    }
    public String getDpiMonitorStatus() {
        return this.dpiMonitorStatus;
    }

    public GetSmartAGDpiAttributeResponseBody setDpiStatus(String dpiStatus) {
        this.dpiStatus = dpiStatus;
        return this;
    }
    public String getDpiStatus() {
        return this.dpiStatus;
    }

    public GetSmartAGDpiAttributeResponseBody setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public GetSmartAGDpiAttributeResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetSmartAGDpiAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSmartAGDpiAttributeResponseBody setSlsRegion(String slsRegion) {
        this.slsRegion = slsRegion;
        return this;
    }
    public String getSlsRegion() {
        return this.slsRegion;
    }

}
