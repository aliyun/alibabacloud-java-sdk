// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetRdTreeResponseBody extends TeaModel {
    /**
     * <p>The processing result.</p>
     */
    @NameInMap("Data")
    public GetRdTreeResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30CBF632-109F-596F-97F2-451C8B2A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRdTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRdTreeResponseBody self = new GetRdTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRdTreeResponseBody setData(GetRdTreeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRdTreeResponseBodyData getData() {
        return this.data;
    }

    public GetRdTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRdTreeResponseBodyData extends TeaModel {
        /**
         * <p>The subfolder.</p>
         */
        @NameInMap("Children")
        public java.util.List<?> children;

        /**
         * <p>The ID of the folder in the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-CGA73I****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The name of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>Root</p>
         */
        @NameInMap("FolderName")
        public String folderName;

        public static GetRdTreeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRdTreeResponseBodyData self = new GetRdTreeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRdTreeResponseBodyData setChildren(java.util.List<?> children) {
            this.children = children;
            return this;
        }
        public java.util.List<?> getChildren() {
            return this.children;
        }

        public GetRdTreeResponseBodyData setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public GetRdTreeResponseBodyData setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

    }

}
