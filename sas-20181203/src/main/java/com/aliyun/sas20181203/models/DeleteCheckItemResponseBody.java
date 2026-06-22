// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCheckItemResponseBody extends TeaModel {
    /**
     * <p>The list of deleted custom check items.</p>
     */
    @NameInMap("CheckItems")
    public java.util.List<DeleteCheckItemResponseBodyCheckItems> checkItems;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>20456DD5-5CBF-5015-9173-12CA4246B***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCheckItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCheckItemResponseBody self = new DeleteCheckItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCheckItemResponseBody setCheckItems(java.util.List<DeleteCheckItemResponseBodyCheckItems> checkItems) {
        this.checkItems = checkItems;
        return this;
    }
    public java.util.List<DeleteCheckItemResponseBodyCheckItems> getCheckItems() {
        return this.checkItems;
    }

    public DeleteCheckItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteCheckItemResponseBodyCheckItems extends TeaModel {
        /**
         * <p>The check item ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000001</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The check item name.</p>
         * 
         * <strong>example:</strong>
         * <p>testCheckItemName</p>
         */
        @NameInMap("CheckShowName")
        public String checkShowName;

        public static DeleteCheckItemResponseBodyCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DeleteCheckItemResponseBodyCheckItems self = new DeleteCheckItemResponseBodyCheckItems();
            return TeaModel.build(map, self);
        }

        public DeleteCheckItemResponseBodyCheckItems setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public DeleteCheckItemResponseBodyCheckItems setCheckShowName(String checkShowName) {
            this.checkShowName = checkShowName;
            return this;
        }
        public String getCheckShowName() {
            return this.checkShowName;
        }

    }

}
