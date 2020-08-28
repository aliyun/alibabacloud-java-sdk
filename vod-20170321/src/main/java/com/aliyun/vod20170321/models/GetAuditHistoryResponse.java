// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAuditHistoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("Histories")
    @Validation(required = true)
    public java.util.List<GetAuditHistoryResponseHistories> histories;

    public static GetAuditHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditHistoryResponse self = new GetAuditHistoryResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAuditHistoryResponseHistories extends TeaModel {
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Reason")
        @Validation(required = true)
        public String reason;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("Auditor")
        @Validation(required = true)
        public String auditor;

        public static GetAuditHistoryResponseHistories build(java.util.Map<String, ?> map) throws Exception {
            GetAuditHistoryResponseHistories self = new GetAuditHistoryResponseHistories();
            return TeaModel.build(map, self);
        }

    }

}
