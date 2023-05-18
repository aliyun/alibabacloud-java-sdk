// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListTargetAttachmentsForControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of objects to which the control policy is attached.</p>
     */
    @NameInMap("TargetAttachments")
    public ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachments targetAttachments;

    /**
     * <p>The total number of objects to which the control policy is attached.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTargetAttachmentsForControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTargetAttachmentsForControlPolicyResponseBody self = new ListTargetAttachmentsForControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTargetAttachmentsForControlPolicyResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTargetAttachmentsForControlPolicyResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTargetAttachmentsForControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTargetAttachmentsForControlPolicyResponseBody setTargetAttachments(ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachments targetAttachments) {
        this.targetAttachments = targetAttachments;
        return this;
    }
    public ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachments getTargetAttachments() {
        return this.targetAttachments;
    }

    public ListTargetAttachmentsForControlPolicyResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachmentsTargetAttachment extends TeaModel {
        /**
         * <p>The time when the control policy was attached to the object.</p>
         */
        @NameInMap("AttachDate")
        public String attachDate;

        /**
         * <p>The ID of the object.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the object.</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the object. Valid values:</p>
         * <br>
         * <p>*   Root: Root folder</p>
         * <p>*   Folder: child folder of the Root folder</p>
         * <p>*   Account: member account</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachmentsTargetAttachment build(java.util.Map<String, ?> map) throws Exception {
            ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachmentsTargetAttachment self = new ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachmentsTargetAttachment();
            return TeaModel.build(map, self);
        }

        public ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachmentsTargetAttachment setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachmentsTargetAttachment setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachmentsTargetAttachment setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachmentsTargetAttachment setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachments extends TeaModel {
        @NameInMap("TargetAttachment")
        public java.util.List<ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachmentsTargetAttachment> targetAttachment;

        public static ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachments self = new ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachments();
            return TeaModel.build(map, self);
        }

        public ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachments setTargetAttachment(java.util.List<ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachmentsTargetAttachment> targetAttachment) {
            this.targetAttachment = targetAttachment;
            return this;
        }
        public java.util.List<ListTargetAttachmentsForControlPolicyResponseBodyTargetAttachmentsTargetAttachment> getTargetAttachment() {
            return this.targetAttachment;
        }

    }

}
