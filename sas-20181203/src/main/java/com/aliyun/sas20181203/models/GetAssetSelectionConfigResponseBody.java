// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetSelectionConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAssetSelectionConfigResponseBodyData data;

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
        @NameInMap("SelectionKey")
        public String selectionKey;

        @NameInMap("TargetType")
        public String targetType;

        public static GetAssetSelectionConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAssetSelectionConfigResponseBodyData self = new GetAssetSelectionConfigResponseBodyData();
            return TeaModel.build(map, self);
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
