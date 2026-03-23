// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSecretsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Secrets")
    public java.util.List<DescribeSecretsResponseBodySecrets> secrets;

    public static DescribeSecretsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecretsResponseBody self = new DescribeSecretsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecretsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSecretsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSecretsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecretsResponseBody setSecrets(java.util.List<DescribeSecretsResponseBodySecrets> secrets) {
        this.secrets = secrets;
        return this;
    }
    public java.util.List<DescribeSecretsResponseBodySecrets> getSecrets() {
        return this.secrets;
    }

    public static class DescribeSecretsResponseBodySecrets extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("Description")
        public String description;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecretArn")
        public String secretArn;

        @NameInMap("SecretName")
        public String secretName;

        @NameInMap("Username")
        public String username;

        public static DescribeSecretsResponseBodySecrets build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecretsResponseBodySecrets self = new DescribeSecretsResponseBodySecrets();
            return TeaModel.build(map, self);
        }

        public DescribeSecretsResponseBodySecrets setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DescribeSecretsResponseBodySecrets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecretsResponseBodySecrets setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSecretsResponseBodySecrets setSecretArn(String secretArn) {
            this.secretArn = secretArn;
            return this;
        }
        public String getSecretArn() {
            return this.secretArn;
        }

        public DescribeSecretsResponseBodySecrets setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

        public DescribeSecretsResponseBodySecrets setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
