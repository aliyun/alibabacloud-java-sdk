// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAssetSelectionConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateAssetSelectionConfigResponseBodyData data;

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
        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("SelectionKey")
        public Long selectionKey;

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
