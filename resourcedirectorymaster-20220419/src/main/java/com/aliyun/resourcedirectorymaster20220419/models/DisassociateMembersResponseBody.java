// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DisassociateMembersResponseBody extends TeaModel {
    /**
     * <p>The time when the contact was unbound from the object.</p>
     */
    @NameInMap("Members")
    public java.util.List<DisassociateMembersResponseBodyMembers> members;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>95060F1D-6990-4645-8920-A81D1BBFE992</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisassociateMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisassociateMembersResponseBody self = new DisassociateMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DisassociateMembersResponseBody setMembers(java.util.List<DisassociateMembersResponseBodyMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<DisassociateMembersResponseBodyMembers> getMembers() {
        return this.members;
    }

    public DisassociateMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DisassociateMembersResponseBodyMembers extends TeaModel {
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
         * <p>The time when the contact was unbound from the object.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-27 17:19:21</p>
         */
        @NameInMap("ModifyDate")
        public String modifyDate;

        public static DisassociateMembersResponseBodyMembers build(java.util.Map<String, ?> map) throws Exception {
            DisassociateMembersResponseBodyMembers self = new DisassociateMembersResponseBodyMembers();
            return TeaModel.build(map, self);
        }

        public DisassociateMembersResponseBodyMembers setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public DisassociateMembersResponseBodyMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public DisassociateMembersResponseBodyMembers setModifyDate(String modifyDate) {
            this.modifyDate = modifyDate;
            return this;
        }
        public String getModifyDate() {
            return this.modifyDate;
        }

    }

}
