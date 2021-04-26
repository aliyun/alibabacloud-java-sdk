// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListEmapResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OpenEmaps")
    public ListEmapResponseBodyOpenEmaps openEmaps;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListEmapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEmapResponseBody self = new ListEmapResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEmapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEmapResponseBody setOpenEmaps(ListEmapResponseBodyOpenEmaps openEmaps) {
        this.openEmaps = openEmaps;
        return this;
    }
    public ListEmapResponseBodyOpenEmaps getOpenEmaps() {
        return this.openEmaps;
    }

    public ListEmapResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListEmapResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListEmapResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEmapResponseBodyOpenEmapsOpenEmap extends TeaModel {
        @NameInMap("EmapId")
        public String emapId;

        @NameInMap("LocationId")
        public String locationId;

        @NameInMap("Name")
        public String name;

        @NameInMap("EmapUrl")
        public String emapUrl;

        public static ListEmapResponseBodyOpenEmapsOpenEmap build(java.util.Map<String, ?> map) throws Exception {
            ListEmapResponseBodyOpenEmapsOpenEmap self = new ListEmapResponseBodyOpenEmapsOpenEmap();
            return TeaModel.build(map, self);
        }

        public ListEmapResponseBodyOpenEmapsOpenEmap setEmapId(String emapId) {
            this.emapId = emapId;
            return this;
        }
        public String getEmapId() {
            return this.emapId;
        }

        public ListEmapResponseBodyOpenEmapsOpenEmap setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }
        public String getLocationId() {
            return this.locationId;
        }

        public ListEmapResponseBodyOpenEmapsOpenEmap setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEmapResponseBodyOpenEmapsOpenEmap setEmapUrl(String emapUrl) {
            this.emapUrl = emapUrl;
            return this;
        }
        public String getEmapUrl() {
            return this.emapUrl;
        }

    }

    public static class ListEmapResponseBodyOpenEmaps extends TeaModel {
        @NameInMap("OpenEmap")
        public java.util.List<ListEmapResponseBodyOpenEmapsOpenEmap> openEmap;

        public static ListEmapResponseBodyOpenEmaps build(java.util.Map<String, ?> map) throws Exception {
            ListEmapResponseBodyOpenEmaps self = new ListEmapResponseBodyOpenEmaps();
            return TeaModel.build(map, self);
        }

        public ListEmapResponseBodyOpenEmaps setOpenEmap(java.util.List<ListEmapResponseBodyOpenEmapsOpenEmap> openEmap) {
            this.openEmap = openEmap;
            return this;
        }
        public java.util.List<ListEmapResponseBodyOpenEmapsOpenEmap> getOpenEmap() {
            return this.openEmap;
        }

    }

}
