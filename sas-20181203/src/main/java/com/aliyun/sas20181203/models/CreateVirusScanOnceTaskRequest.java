// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateVirusScanOnceTaskRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. Different requests should use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The extended information field:</p>
     * <ul>
     * <li><strong>additionType</strong>: the extended scan type</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;additionType\&quot;:[\&quot;SCAN_MEMORY\&quot;]}</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The scan path information to be transmitted if the scan type is custom scan.</p>
     */
    @NameInMap("ScanPath")
    public java.util.List<String> scanPath;

    /**
     * <p>The scan type of the virus scan. Valid values:</p>
     * <ul>
     * <li><strong>system</strong>: system scan</li>
     * <li><strong>user</strong>: custom scan.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("ScanType")
    public String scanType;

    /**
     * <p>The key that stores asset information.</p>
     * <blockquote>
     * <p>You can call the <a href="~~GetAssetSelectionConfig~~">GetAssetSelectionConfig</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>845de1ec-4b08-42e1-b564-31321e48xxxx</p>
     */
    @NameInMap("SelectionKey")
    public String selectionKey;

    public static CreateVirusScanOnceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirusScanOnceTaskRequest self = new CreateVirusScanOnceTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirusScanOnceTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVirusScanOnceTaskRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public CreateVirusScanOnceTaskRequest setScanPath(java.util.List<String> scanPath) {
        this.scanPath = scanPath;
        return this;
    }
    public java.util.List<String> getScanPath() {
        return this.scanPath;
    }

    public CreateVirusScanOnceTaskRequest setScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }
    public String getScanType() {
        return this.scanType;
    }

    public CreateVirusScanOnceTaskRequest setSelectionKey(String selectionKey) {
        this.selectionKey = selectionKey;
        return this;
    }
    public String getSelectionKey() {
        return this.selectionKey;
    }

}
