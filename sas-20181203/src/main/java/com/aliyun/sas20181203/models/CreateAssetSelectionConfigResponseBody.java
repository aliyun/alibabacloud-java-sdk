// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAssetSelectionConfigResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateAssetSelectionConfigResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3D7C47D-3F11-57BB-90E8-E5C20C619F37</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAssetSelectionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetSelectionConfigResponseBody self = new CreateAssetSelectionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAssetSelectionConfigResponseBody setData(CreateAssetSelectionConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAssetSelectionConfigResponseBodyData getData() {
        return this.data;
    }

    public CreateAssetSelectionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAssetSelectionConfigResponseBodyData extends TeaModel {
        /**
         * <p>The business type that is selected for the asset. Valid values:</p>
         * <ul>
         * <li><strong>VIRUS_SCAN_CYCLE_CONFIG</strong>: virus detection configuration</li>
         * <li><strong>VIRUS_SCAN_ONCE_TASK</strong>: one-time scan for virus detection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VIRUS_SCAN_CYCLE_CONFIG</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <p>The operating system of the asset. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: the Windows operating system</li>
         * <li><strong>linux</strong>: the Linux operating system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The ID of the current asset selection. It can be used to query and modify the asset that is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>53e93435-d694-4c03-9ce7-da12bee1****</p>
         */
        @NameInMap("SelectionKey")
        public Long selectionKey;

        /**
         * <p>The dimension based on which the asset is selected. Valid values:</p>
         * <ul>
         * <li><strong>group</strong>: The asset is selected by server.</li>
         * <li><strong>group</strong>: The asset is selected by group.</li>
         * <li><strong>vpc</strong>: The asset is selected by VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static CreateAssetSelectionConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAssetSelectionConfigResponseBodyData self = new CreateAssetSelectionConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAssetSelectionConfigResponseBodyData setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public CreateAssetSelectionConfigResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public CreateAssetSelectionConfigResponseBodyData setSelectionKey(Long selectionKey) {
            this.selectionKey = selectionKey;
            return this;
        }
        public Long getSelectionKey() {
            return this.selectionKey;
        }

        public CreateAssetSelectionConfigResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
