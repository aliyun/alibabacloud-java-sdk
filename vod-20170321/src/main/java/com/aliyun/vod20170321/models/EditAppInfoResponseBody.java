// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class EditAppInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public EditAppInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static EditAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditAppInfoResponseBody self = new EditAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public EditAppInfoResponseBody setData(EditAppInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EditAppInfoResponseBodyData getData() {
        return this.data;
    }

    public EditAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EditAppInfoResponseBodyData extends TeaModel {
        @NameInMap("ItemId")
        public String itemId;

        public static EditAppInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EditAppInfoResponseBodyData self = new EditAppInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EditAppInfoResponseBodyData setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

    }

}
