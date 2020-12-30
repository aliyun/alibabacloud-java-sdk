// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeCategoriesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Categories")
    public DescribeCategoriesResponseBodyCategories categories;

    @NameInMap("Code")
    public String code;

    public static DescribeCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoriesResponseBody self = new DescribeCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCategoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCategoriesResponseBody setCategories(DescribeCategoriesResponseBodyCategories categories) {
        this.categories = categories;
        return this;
    }
    public DescribeCategoriesResponseBodyCategories getCategories() {
        return this.categories;
    }

    public DescribeCategoriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeCategoriesResponseBodyCategoriesCategoryDemoProjectsDemoProject extends TeaModel {
        @NameInMap("SourceUrl")
        public String sourceUrl;

        @NameInMap("PackageDownloadUrl")
        public String packageDownloadUrl;

        @NameInMap("PackageUrl")
        public String packageUrl;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeCategoriesResponseBodyCategoriesCategoryDemoProjectsDemoProject build(java.util.Map<String, ?> map) throws Exception {
            DescribeCategoriesResponseBodyCategoriesCategoryDemoProjectsDemoProject self = new DescribeCategoriesResponseBodyCategoriesCategoryDemoProjectsDemoProject();
            return TeaModel.build(map, self);
        }

        public DescribeCategoriesResponseBodyCategoriesCategoryDemoProjectsDemoProject setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public DescribeCategoriesResponseBodyCategoriesCategoryDemoProjectsDemoProject setPackageDownloadUrl(String packageDownloadUrl) {
            this.packageDownloadUrl = packageDownloadUrl;
            return this;
        }
        public String getPackageDownloadUrl() {
            return this.packageDownloadUrl;
        }

        public DescribeCategoriesResponseBodyCategoriesCategoryDemoProjectsDemoProject setPackageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }
        public String getPackageUrl() {
            return this.packageUrl;
        }

        public DescribeCategoriesResponseBodyCategoriesCategoryDemoProjectsDemoProject setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeCategoriesResponseBodyCategoriesCategoryDemoProjects extends TeaModel {
        @NameInMap("DemoProject")
        public java.util.List<DescribeCategoriesResponseBodyCategoriesCategoryDemoProjectsDemoProject> demoProject;

        public static DescribeCategoriesResponseBodyCategoriesCategoryDemoProjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeCategoriesResponseBodyCategoriesCategoryDemoProjects self = new DescribeCategoriesResponseBodyCategoriesCategoryDemoProjects();
            return TeaModel.build(map, self);
        }

        public DescribeCategoriesResponseBodyCategoriesCategoryDemoProjects setDemoProject(java.util.List<DescribeCategoriesResponseBodyCategoriesCategoryDemoProjectsDemoProject> demoProject) {
            this.demoProject = demoProject;
            return this;
        }
        public java.util.List<DescribeCategoriesResponseBodyCategoriesCategoryDemoProjectsDemoProject> getDemoProject() {
            return this.demoProject;
        }

    }

    public static class DescribeCategoriesResponseBodyCategoriesCategory extends TeaModel {
        @NameInMap("CategoryLogo")
        public String categoryLogo;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("DemoProjects")
        public DescribeCategoriesResponseBodyCategoriesCategoryDemoProjects demoProjects;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("CategoryDescription")
        public String categoryDescription;

        public static DescribeCategoriesResponseBodyCategoriesCategory build(java.util.Map<String, ?> map) throws Exception {
            DescribeCategoriesResponseBodyCategoriesCategory self = new DescribeCategoriesResponseBodyCategoriesCategory();
            return TeaModel.build(map, self);
        }

        public DescribeCategoriesResponseBodyCategoriesCategory setCategoryLogo(String categoryLogo) {
            this.categoryLogo = categoryLogo;
            return this;
        }
        public String getCategoryLogo() {
            return this.categoryLogo;
        }

        public DescribeCategoriesResponseBodyCategoriesCategory setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeCategoriesResponseBodyCategoriesCategory setDemoProjects(DescribeCategoriesResponseBodyCategoriesCategoryDemoProjects demoProjects) {
            this.demoProjects = demoProjects;
            return this;
        }
        public DescribeCategoriesResponseBodyCategoriesCategoryDemoProjects getDemoProjects() {
            return this.demoProjects;
        }

        public DescribeCategoriesResponseBodyCategoriesCategory setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCategoriesResponseBodyCategoriesCategory setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public DescribeCategoriesResponseBodyCategoriesCategory setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeCategoriesResponseBodyCategoriesCategory setCategoryDescription(String categoryDescription) {
            this.categoryDescription = categoryDescription;
            return this;
        }
        public String getCategoryDescription() {
            return this.categoryDescription;
        }

    }

    public static class DescribeCategoriesResponseBodyCategories extends TeaModel {
        @NameInMap("Category")
        public java.util.List<DescribeCategoriesResponseBodyCategoriesCategory> category;

        public static DescribeCategoriesResponseBodyCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeCategoriesResponseBodyCategories self = new DescribeCategoriesResponseBodyCategories();
            return TeaModel.build(map, self);
        }

        public DescribeCategoriesResponseBodyCategories setCategory(java.util.List<DescribeCategoriesResponseBodyCategoriesCategory> category) {
            this.category = category;
            return this;
        }
        public java.util.List<DescribeCategoriesResponseBodyCategoriesCategory> getCategory() {
            return this.category;
        }

    }

}
