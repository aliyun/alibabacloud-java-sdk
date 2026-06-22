// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetSelectionSelectedTargetResponseBody extends TeaModel {
    /**
     * <p>The data details.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAssetSelectionSelectedTargetResponseBodyData> data;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1EB12F73-6828-59D2-9FBF-F3713FD55128</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAssetSelectionSelectedTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssetSelectionSelectedTargetResponseBody self = new ListAssetSelectionSelectedTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssetSelectionSelectedTargetResponseBody setData(java.util.List<ListAssetSelectionSelectedTargetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAssetSelectionSelectedTargetResponseBodyData> getData() {
        return this.data;
    }

    public ListAssetSelectionSelectedTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAssetSelectionSelectedTargetResponseBodyData extends TeaModel {
        /**
         * <p>The asset ID. When selecting by machine, the value is the UUID of the machine. When selecting by group, the value is the group ID. When selecting by VPC, the value is the VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30****</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The asset name.</p>
         * 
         * <strong>example:</strong>
         * <p>jen****</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        public static ListAssetSelectionSelectedTargetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAssetSelectionSelectedTargetResponseBodyData self = new ListAssetSelectionSelectedTargetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAssetSelectionSelectedTargetResponseBodyData setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListAssetSelectionSelectedTargetResponseBodyData setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

    }

}
