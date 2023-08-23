// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetSelectionSelectedTargetResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAssetSelectionSelectedTargetResponseBodyData> data;

    /**
     * <p>The request ID.</p>
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
         * <p>The ID of the asset.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the asset.</p>
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
