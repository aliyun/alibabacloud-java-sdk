// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ImportSpecialPersonnelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("SpecialPersonnelMaps")
    public ImportSpecialPersonnelResponseBodySpecialPersonnelMaps specialPersonnelMaps;

    @NameInMap("Success")
    public Boolean success;

    public static ImportSpecialPersonnelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportSpecialPersonnelResponseBody self = new ImportSpecialPersonnelResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportSpecialPersonnelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportSpecialPersonnelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ImportSpecialPersonnelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ImportSpecialPersonnelResponseBody setSpecialPersonnelMaps(ImportSpecialPersonnelResponseBodySpecialPersonnelMaps specialPersonnelMaps) {
        this.specialPersonnelMaps = specialPersonnelMaps;
        return this;
    }
    public ImportSpecialPersonnelResponseBodySpecialPersonnelMaps getSpecialPersonnelMaps() {
        return this.specialPersonnelMaps;
    }

    public ImportSpecialPersonnelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportSpecialPersonnelResponseBodySpecialPersonnelMapsSpecialPersonnelMap extends TeaModel {
        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("UkId")
        public Long ukId;

        public static ImportSpecialPersonnelResponseBodySpecialPersonnelMapsSpecialPersonnelMap build(java.util.Map<String, ?> map) throws Exception {
            ImportSpecialPersonnelResponseBodySpecialPersonnelMapsSpecialPersonnelMap self = new ImportSpecialPersonnelResponseBodySpecialPersonnelMapsSpecialPersonnelMap();
            return TeaModel.build(map, self);
        }

        public ImportSpecialPersonnelResponseBodySpecialPersonnelMapsSpecialPersonnelMap setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public ImportSpecialPersonnelResponseBodySpecialPersonnelMapsSpecialPersonnelMap setUkId(Long ukId) {
            this.ukId = ukId;
            return this;
        }
        public Long getUkId() {
            return this.ukId;
        }

    }

    public static class ImportSpecialPersonnelResponseBodySpecialPersonnelMaps extends TeaModel {
        @NameInMap("SpecialPersonnelMap")
        public java.util.List<ImportSpecialPersonnelResponseBodySpecialPersonnelMapsSpecialPersonnelMap> specialPersonnelMap;

        public static ImportSpecialPersonnelResponseBodySpecialPersonnelMaps build(java.util.Map<String, ?> map) throws Exception {
            ImportSpecialPersonnelResponseBodySpecialPersonnelMaps self = new ImportSpecialPersonnelResponseBodySpecialPersonnelMaps();
            return TeaModel.build(map, self);
        }

        public ImportSpecialPersonnelResponseBodySpecialPersonnelMaps setSpecialPersonnelMap(java.util.List<ImportSpecialPersonnelResponseBodySpecialPersonnelMapsSpecialPersonnelMap> specialPersonnelMap) {
            this.specialPersonnelMap = specialPersonnelMap;
            return this;
        }
        public java.util.List<ImportSpecialPersonnelResponseBodySpecialPersonnelMapsSpecialPersonnelMap> getSpecialPersonnelMap() {
            return this.specialPersonnelMap;
        }

    }

}
