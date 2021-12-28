// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeCrTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ChineseName")
        public String chineseName;

        @NameInMap("EnglishName")
        public String englishName;

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
