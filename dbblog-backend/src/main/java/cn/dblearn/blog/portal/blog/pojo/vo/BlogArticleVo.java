package cn.dblearn.blog.portal.blog.pojo.vo;

import cn.dblearn.blog.portal.blog.pojo.entity.BlogTag;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * BlogArticleVo
 *
 * @author bobbi
 * @date 2018/11/07 20:39
 * @email 571002217@qq.com
 * @description
 */
@Data
public class BlogArticleVo {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Integer articleId;

    @ApiModelProperty(value = "文章标题")
    private String title;

    @ApiModelProperty(value = "文章描述")
    private String description;

    @ApiModelProperty(value = "文章作者")
    private String author;

    @ApiModelProperty(value = "阅读量")
    private Long readNum;

    @ApiModelProperty(value = "评论量")
    private Long commentNum;

    @ApiModelProperty(value = "点赞量")
    private Long likeNum;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    /**
     * 所关联的Tag列表
     */
    private List<BlogTag> tagList;
}
