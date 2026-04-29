// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddUnknownThreatDetectProcessResponseBody extends TeaModel {
    @NameInMap("IdList")
    public java.util.List<AddUnknownThreatDetectProcessResponseBodyIdList> idList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ADE57832-9666-511C-9A80-B87DE2E8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddUnknownThreatDetectProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUnknownThreatDetectProcessResponseBody self = new AddUnknownThreatDetectProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUnknownThreatDetectProcessResponseBody setIdList(java.util.List<AddUnknownThreatDetectProcessResponseBodyIdList> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<AddUnknownThreatDetectProcessResponseBodyIdList> getIdList() {
        return this.idList;
    }

    public AddUnknownThreatDetectProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddUnknownThreatDetectProcessResponseBodyIdList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>92666883</p>
         */
        @NameInMap("Id")
        public String id;

        public static AddUnknownThreatDetectProcessResponseBodyIdList build(java.util.Map<String, ?> map) throws Exception {
            AddUnknownThreatDetectProcessResponseBodyIdList self = new AddUnknownThreatDetectProcessResponseBodyIdList();
            return TeaModel.build(map, self);
        }

        public AddUnknownThreatDetectProcessResponseBodyIdList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
