// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class AssociateMembersResponseBody extends TeaModel {
    @NameInMap("Members")
    public java.util.List<AssociateMembersResponseBodyMembers> members;

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
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("MemberId")
        public String memberId;

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
