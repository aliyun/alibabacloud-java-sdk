// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class CreateVirusScanOnceTaskResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, refer to error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateVirusScanOnceTaskResponseBodyData data;

    /**
     * <p>The message information.</p>
     * 
     * <strong>example:</strong>
     * <p>successful‌</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>739705BB-B0EF-554B-B3A8-383F4F93E067</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call is successful.                               </li>
     * <li><strong>false</strong>: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateVirusScanOnceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirusScanOnceTaskResponseBody self = new CreateVirusScanOnceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirusScanOnceTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVirusScanOnceTaskResponseBody setData(CreateVirusScanOnceTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateVirusScanOnceTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateVirusScanOnceTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVirusScanOnceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVirusScanOnceTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateVirusScanOnceTaskResponseBodyData extends TeaModel {
        /**
         * <p>The asset selection business type. Valid values:</p>
         * <ul>
         * <li><strong>VIRUS_SCAN_CYCLE_CONFIG</strong>: virus scan configuration</li>
         * <li><strong>VIRUS_SCAN_ONCE_TASK</strong>: virus scan one-time task</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VIRUS_SCAN_CYCLE_CONFIG</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <p>The operating system of the target asset. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows operating system</li>
         * <li><strong>linux</strong>: Linux operating system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1D345A09-5ABD-593C-9C26-5C2B28632CD6</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The unique identifier of this asset selection, which can be used to query or modify the assets corresponding to this selection.</p>
         * 
         * <strong>example:</strong>
         * <p>87af4d19-38fc-408d-9549-2bf7b6c2a4b9</p>
         */
        @NameInMap("SelectionKey")
        public Integer selectionKey;

        /**
         * <p>The target asset type. Valid values:</p>
         * <ul>
         * <li><strong>all_instance</strong>: all servers</li>
         * <li><strong>instance</strong>: select by server</li>
         * <li><strong>group</strong>: select by group</li>
         * <li><strong>vpc</strong>: select by VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all_instance</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9ef1a02e1de695cb7f9fea2c6c145853eklEsP2JP0Z</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static CreateVirusScanOnceTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateVirusScanOnceTaskResponseBodyData self = new CreateVirusScanOnceTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateVirusScanOnceTaskResponseBodyData setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public CreateVirusScanOnceTaskResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public CreateVirusScanOnceTaskResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateVirusScanOnceTaskResponseBodyData setSelectionKey(Integer selectionKey) {
            this.selectionKey = selectionKey;
            return this;
        }
        public Integer getSelectionKey() {
            return this.selectionKey;
        }

        public CreateVirusScanOnceTaskResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public CreateVirusScanOnceTaskResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
