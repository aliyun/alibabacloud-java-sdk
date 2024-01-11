// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageBuildRiskItemResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListImageBuildRiskItemResponseBodyData> data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListImageBuildRiskItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageBuildRiskItemResponseBody self = new ListImageBuildRiskItemResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageBuildRiskItemResponseBody setData(java.util.List<ListImageBuildRiskItemResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListImageBuildRiskItemResponseBodyData> getData() {
        return this.data;
    }

    public ListImageBuildRiskItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListImageBuildRiskItemResponseBodyData extends TeaModel {
        /**
         * <p>The key of the name for the image build risk item.</p>
         */
        @NameInMap("ItemKey")
        public String itemKey;

        /**
         * <p>The name of the name for the image build risk item.</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        public static ListImageBuildRiskItemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListImageBuildRiskItemResponseBodyData self = new ListImageBuildRiskItemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListImageBuildRiskItemResponseBodyData setItemKey(String itemKey) {
            this.itemKey = itemKey;
            return this;
        }
        public String getItemKey() {
            return this.itemKey;
        }

        public ListImageBuildRiskItemResponseBodyData setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

    }

}
