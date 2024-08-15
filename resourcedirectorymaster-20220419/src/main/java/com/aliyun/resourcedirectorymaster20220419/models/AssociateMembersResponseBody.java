// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class AssociateMembersResponseBody extends TeaModel {
    /**
     * <p>The time when the contact was bound to the object.</p>
     */
    @NameInMap("Members")
    public java.util.List<AssociateMembersResponseBodyMembers> members;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>95060F1D-6990-4645-8920-A81D1BBFE992</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateMembersResponseBody self = new AssociateMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateMembersResponseBody setMembers(java.util.List<AssociateMembersResponseBodyMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<AssociateMembersResponseBodyMembers> getMembers() {
        return this.members;
    }

    public AssociateMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AssociateMembersResponseBodyMembers extends TeaModel {
        /**
         * <p>The ID of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>c-qL4HqKONzOM7****</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>The ID of the object. Valid values:</p>
         * <ul>
         * <li>ID of the resource directory</li>
         * <li>ID of the folder</li>
         * <li>ID of the member</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fd-ZDNPiT****</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <p>The time when the contact was bound to the object.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-27 17:19:21</p>
         */
        @NameInMap("ModifyDate")
        public String modifyDate;

        public static AssociateMembersResponseBodyMembers build(java.util.Map<String, ?> map) throws Exception {
            AssociateMembersResponseBodyMembers self = new AssociateMembersResponseBodyMembers();
            return TeaModel.build(map, self);
        }

        public AssociateMembersResponseBodyMembers setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public AssociateMembersResponseBodyMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public AssociateMembersResponseBodyMembers setModifyDate(String modifyDate) {
            this.modifyDate = modifyDate;
            return this;
        }
        public String getModifyDate() {
            return this.modifyDate;
        }

    }

}
