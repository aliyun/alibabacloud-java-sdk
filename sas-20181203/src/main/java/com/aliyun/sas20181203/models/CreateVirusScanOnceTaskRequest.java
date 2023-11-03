// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateVirusScanOnceTaskRequest extends TeaModel {
    /**
     * <p>The information about the scan path that is required for a custom scan.</p>
     */
    @NameInMap("ScanPath")
    public java.util.List<String> scanPath;

    /**
     * <p>The type of the virus scan. Valid values:</p>
     * <br>
     * <p>*   **system**: system scan.</p>
     * <p>*   **user**: custom scan.</p>
     */
    @NameInMap("ScanType")
    public String scanType;

    /**
     * <p>The key that stores the asset information.</p>
     * <br>
     * <p>> You can call the [GetAssetSelectionConfig](~~GetAssetSelectionConfig~~) operation to obtain the key value.</p>
     */
    @NameInMap("SelectionKey")
    public String selectionKey;

    public static CreateVirusScanOnceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirusScanOnceTaskRequest self = new CreateVirusScanOnceTaskRequest();
        return TeaModel.build(map, self);
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
