// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DisassociateMembersResponseBody extends TeaModel {
    @NameInMap("Members")
    public java.util.List<DisassociateMembersResponseBodyMembers> members;

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
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("MemberId")
        public String memberId;

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
