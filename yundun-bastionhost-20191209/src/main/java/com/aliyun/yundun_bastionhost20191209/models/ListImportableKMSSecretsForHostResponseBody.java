// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListImportableKMSSecretsForHostResponseBody extends TeaModel {
    /**
     * <p>The value of the <code>MaxResults</code> parameter in the request. If the parameter was not specified, the default value of 20 is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. If this field is empty, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4ieSWJCwxvW3dk3wF.BqkrZmP72nWu5zJ5NWydMqyEs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of importable secrets.</p>
     */
    @NameInMap("Secrets")
    public java.util.List<ListImportableKMSSecretsForHostResponseBodySecrets> secrets;

    public static ListImportableKMSSecretsForHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImportableKMSSecretsForHostResponseBody self = new ListImportableKMSSecretsForHostResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImportableKMSSecretsForHostResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListImportableKMSSecretsForHostResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListImportableKMSSecretsForHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImportableKMSSecretsForHostResponseBody setSecrets(java.util.List<ListImportableKMSSecretsForHostResponseBodySecrets> secrets) {
        this.secrets = secrets;
        return this;
    }
    public java.util.List<ListImportableKMSSecretsForHostResponseBodySecrets> getSecrets() {
        return this.secrets;
    }

    public static class ListImportableKMSSecretsForHostResponseBodySecrets extends TeaModel {
        /**
         * <p>The name of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        /**
         * <p>The type of the secret. Valid value:</p>
         * <ul>
         * <li><code>ECS</code>: an ECS secret.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("SecretType")
        public String secretType;

        /**
         * <p>The tags associated with the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Tags")
        public String tags;

        public static ListImportableKMSSecretsForHostResponseBodySecrets build(java.util.Map<String, ?> map) throws Exception {
            ListImportableKMSSecretsForHostResponseBodySecrets self = new ListImportableKMSSecretsForHostResponseBodySecrets();
            return TeaModel.build(map, self);
        }

        public ListImportableKMSSecretsForHostResponseBodySecrets setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

        public ListImportableKMSSecretsForHostResponseBodySecrets setSecretType(String secretType) {
            this.secretType = secretType;
            return this;
        }
        public String getSecretType() {
            return this.secretType;
        }

        public ListImportableKMSSecretsForHostResponseBodySecrets setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

}
