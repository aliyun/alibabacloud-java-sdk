// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeCrTemplatesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>74E97AE2-2900-55C1-A069-C3C1EA*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The common YAML templates for the specified type of Istio resource.</p>
     */
    @NameInMap("Templates")
    public java.util.List<DescribeCrTemplatesResponseBodyTemplates> templates;

    public static DescribeCrTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrTemplatesResponseBody self = new DescribeCrTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCrTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrTemplatesResponseBody setTemplates(java.util.List<DescribeCrTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<DescribeCrTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public static class DescribeCrTemplatesResponseBodyTemplates extends TeaModel {
        /**
         * <p>The Chinese name of the YAML template.</p>
         */
        @NameInMap("ChineseName")
        public String chineseName;

        /**
         * <p>The English name of the YAML template.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP basic routing</p>
         */
        @NameInMap("EnglishName")
        public String englishName;

        /**
         * <p>The content in the YAML template.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: networking.istio.io/v1beta1\nkind: VirtualService\nmetadata:\n  name: reviews-route # Name for this VirtualService.\nspec:\n  hosts:\n  - reviews.prod.svc.cluster.local # Service that this VirtualSerivce belongs to. \n  http:\n  - name: \&quot;reviews-route\&quot; # Name for the route.\n    route:\n    - destination: # Uniquely identifies the instances of a service to which all traffic should be forwarded to.\n        host: reviews.prod.svc.cluster.local # The name of a service from the service registry or ServiceEntry.\n        port:\n          number: 8080&quot;</p>
         */
        @NameInMap("Yaml")
        public String yaml;

        public static DescribeCrTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrTemplatesResponseBodyTemplates self = new DescribeCrTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeCrTemplatesResponseBodyTemplates setChineseName(String chineseName) {
            this.chineseName = chineseName;
            return this;
        }
        public String getChineseName() {
            return this.chineseName;
        }

        public DescribeCrTemplatesResponseBodyTemplates setEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
        }
        public String getEnglishName() {
            return this.englishName;
        }

        public DescribeCrTemplatesResponseBodyTemplates setYaml(String yaml) {
            this.yaml = yaml;
            return this;
        }
        public String getYaml() {
            return this.yaml;
        }

    }

}
