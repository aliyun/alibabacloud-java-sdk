// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetSelectionConfigResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetAssetSelectionConfigResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C5936B67-3EDF-53ED-A542-02543972449A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAssetSelectionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssetSelectionConfigResponseBody self = new GetAssetSelectionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssetSelectionConfigResponseBody setData(GetAssetSelectionConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAssetSelectionConfigResponseBodyData getData() {
        return this.data;
    }

    public GetAssetSelectionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAssetSelectionConfigResponseBodyData extends TeaModel {
        /**
         * <p>The operating system of the asset. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong></li>
         * <li><strong>linux</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The ID of the current asset selection. It can be used to query and modify the asset that is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>657c8411-4e89-446c-ab66-d45d1331****</p>
         */
        @NameInMap("SelectionKey")
        public String selectionKey;

        /**
         * <p>The dimension based on which the asset is selected. Valid values:</p>
         * <ul>
         * <li><strong>instance</strong>: The asset is selected by server.</li>
         * <li><strong>group</strong>: The asset is selected by group.</li>
         * <li><strong>vpc</strong>: The asset is selected by VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static GetAssetSelectionConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAssetSelectionConfigResponseBodyData self = new GetAssetSelectionConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAssetSelectionConfigResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetAssetSelectionConfigResponseBodyData setSelectionKey(String selectionKey) {
            this.selectionKey = selectionKey;
            return this;
        }
        public String getSelectionKey() {
            return this.selectionKey;
        }

        public GetAssetSelectionConfigResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
