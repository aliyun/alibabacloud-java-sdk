// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListRdDefaultSyncListResponseBody extends TeaModel {
    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public ListRdDefaultSyncListResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447DDCAE1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRdDefaultSyncListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRdDefaultSyncListResponseBody self = new ListRdDefaultSyncListResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRdDefaultSyncListResponseBody setData(ListRdDefaultSyncListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRdDefaultSyncListResponseBodyData getData() {
        return this.data;
    }

    public ListRdDefaultSyncListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRdDefaultSyncListResponseBodyData extends TeaModel {
        /**
         * <p>The IDs of the folders in the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-BwoXuf****,fd-CFamY7****</p>
         */
        @NameInMap("FolderIds")
        public String folderIds;

        public static ListRdDefaultSyncListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRdDefaultSyncListResponseBodyData self = new ListRdDefaultSyncListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRdDefaultSyncListResponseBodyData setFolderIds(String folderIds) {
            this.folderIds = folderIds;
            return this;
        }
        public String getFolderIds() {
            return this.folderIds;
        }

    }

}
