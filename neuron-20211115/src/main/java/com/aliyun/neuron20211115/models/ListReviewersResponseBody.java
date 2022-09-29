// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListReviewersResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<ListReviewersResponseBodyResult> result;

    @NameInMap("rquestId")
    public String rquestId;

    public static ListReviewersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListReviewersResponseBody self = new ListReviewersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListReviewersResponseBody setResult(java.util.List<ListReviewersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListReviewersResponseBodyResult> getResult() {
        return this.result;
    }

    public ListReviewersResponseBody setRquestId(String rquestId) {
        this.rquestId = rquestId;
        return this;
    }
    public String getRquestId() {
        return this.rquestId;
    }

    public static class ListReviewersResponseBodyResult extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("codeupAccountId")
        public String codeupAccountId;

        @NameInMap("email")
        public String email;

        @NameInMap("enterpriseId")
        public Long enterpriseId;

        @NameInMap("name")
        public String name;

        @NameInMap("phone")
        public String phone;

        public static ListReviewersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListReviewersResponseBodyResult self = new ListReviewersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListReviewersResponseBodyResult setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListReviewersResponseBodyResult setCodeupAccountId(String codeupAccountId) {
            this.codeupAccountId = codeupAccountId;
            return this;
        }
        public String getCodeupAccountId() {
            return this.codeupAccountId;
        }

        public ListReviewersResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListReviewersResponseBodyResult setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public ListReviewersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListReviewersResponseBodyResult setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

}
