// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSecretsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DF4961DD-16F5-5B24-BD4C-0C7788F7ADAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the credential.</p>
     */
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
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1266348003******</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The description of the credential.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the credential for the created Data API account.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:rds:cn-hangzhou:1335786***:dbInstance/rm-bp1m7l3j63****</p>
         */
        @NameInMap("SecretArn")
        public String secretArn;

        /**
         * <p>The name of the credential.</p>
         * 
         * <strong>example:</strong>
         * <p>Foo</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        /**
         * <p>The username that is used to access the database.</p>
         * 
         * <strong>example:</strong>
         * <p>user_jack</p>
         */
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
